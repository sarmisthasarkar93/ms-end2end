package com.example.data_service.controller;


import com.example.data_service.model.Report;
import com.example.data_service.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api")
public class DataController {

    @Autowired
    ReportService reportService;

    @GetMapping("/reports")
    public List<Report> getAllReports(){
        return reportService.getAllReports();
    }

    @GetMapping("/report/{id}")
    public Report getReportById(@PathVariable Long id){
        return reportService.getReportById(id);
    }
}
