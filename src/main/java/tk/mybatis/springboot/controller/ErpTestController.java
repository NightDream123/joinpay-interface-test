/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package tk.mybatis.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.springboot.model.PosParam;
import tk.mybatis.springboot.util.HttpClientUtil;

import java.util.Map;

/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@RestController
@RequestMapping("/erp")
public class ErpTestController {
    Logger log = LoggerFactory.getLogger(ErpTestController.class);

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping(value = "/erpdev")
    public ModelAndView erpdev() {
        ModelAndView modelAndView = new ModelAndView("erpsubmit");
        return modelAndView;
    }
    @RequestMapping(value = "/test")
    public ModelAndView testErpParam(PosParam posParam) {
        ModelAndView modelAndView = new ModelAndView();
        log.info("=====================上传参数========================");
        log.info("{}", JSONObject.toJSONString(posParam));
        //发起请求
        log.info("=====================发起请求========================");
        Map<String, String> mapParams = JSON.parseObject(JSONObject.toJSONString(posParam), Map.class);
        String rst = HttpClientUtil.sendRequest(posParam.getUrl(), mapParams, "utf-8");
        //请求结束
        log.info("=====================请求结束========================");
        return modelAndView;
    }
}
