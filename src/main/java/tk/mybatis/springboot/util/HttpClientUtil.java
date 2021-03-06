package tk.mybatis.springboot.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpClientUtil {

	/**
	 * 模拟请求
	 *
	 * @param url       资源地址
	 * @param map   参数列表
	 * @param encoding  编码
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static String sendRequest(String url, Map<String,String> map, String encoding){
		String body = "";

		//创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		//创建post方式请求对象
		HttpPost httpPost = new HttpPost(url);

		//装填参数
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		if(map!=null){
			for (Map.Entry<String, String> entry : map.entrySet()) {
				nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
		}
		//设置参数到请求对象中
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("请求地址："+url);
		System.out.println("请求参数："+nvps.toString());

		//设置header信息
		//指定报文头【Content-type】、【User-Agent】
		httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
		httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		//执行请求操作，并拿到结果（同步阻塞）
		try {
			CloseableHttpResponse response = client.execute(httpPost);
			//获取结果实体
			HttpEntity entity = response.getEntity();
			if (entity != null) {
                //按指定编码转换结果实体为String类型
                body = EntityUtils.toString(entity, encoding);
                System.out.println("请求结果："+body);
            }
			EntityUtils.consume(entity);
			//释放链接
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {

		}
		return body;
	}

}
