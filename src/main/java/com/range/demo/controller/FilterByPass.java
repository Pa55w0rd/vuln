package com.range.demo.controller;

import com.range.demo.utils.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/filter")
public class FilterByPass {

    @ApiOperation(value = "admin接口", notes = "admin接口，需要鉴权")
    @GetMapping("/admin/hello")
    public ResponseResult<String>  admin()
    {

        //判断是否是admin

        return new ResponseResult<>("I am admin role!", "执行成功", 200);


    }

    @ApiOperation(value = "admin接口", notes = "admin接口，需要鉴权")
    @GetMapping("/admin/xxxx.action")
    public ResponseResult<String>  adminAction()
    {

        //判断是否是admin

        return new ResponseResult<>("admin xxxx.action", "执行成功", 200);


    }
    @ApiOperation(value = "operator接口", notes = "operator接口接口，无需要鉴权")
    @GetMapping("/operator/hello")
    public String operator()
    {
        return "i am operator role.";

    }

    @ApiOperation(value = "查看接口方法", notes = "接口路径方法对比")
    @GetMapping("/uri")
    public ResponseResult<String>  uri(HttpServletRequest request)
    {

        String getRequestURI=request.getRequestURI();
        String getContextPath=request.getContextPath();
        String getServletPath=request.getServletPath();
        String getPathInfo=request.getPathInfo();

        String result="getRequestURI: "+getRequestURI+" "
                +"getContextPath: "+getContextPath+"  "
                +"getPathInfo: "+getPathInfo+"  "
                +"getServletPath: "+getServletPath+"  ";

        if (result != null) {
            return new ResponseResult<>(result, "执行成功", 200);
        }
        return new ResponseResult<>("Need Auth!", "执行成功", 200);
    }

}
