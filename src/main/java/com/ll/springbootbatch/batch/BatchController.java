package com.ll.springbootbatch.batch;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/batch")
@RequiredArgsConstructor
public class BatchController {

    private final BatchService batchService;

    @ResponseBody
    @GetMapping("/simple")
    public String runSimpleJob() {
        batchService.runSimpleJob();

        return "runSimpleJob OK";
    }
}
