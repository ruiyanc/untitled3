package com.rui.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.Callable;

@RequestMapping("/asyc")
@ResponseBody
public class AsycController {
    @RequestMapping(method = RequestMethod.POST)
    public Callable<String> processUpload(final MultipartFile file) {
        return () -> "someView";
    }
}

