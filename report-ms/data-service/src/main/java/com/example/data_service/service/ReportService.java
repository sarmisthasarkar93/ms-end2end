package com.example.data_service.service;

import com.example.data_service.model.Report;
import com.example.data_service.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

    public Report getReportById(Long id){
        return reportRepository.findById(id).orElse(null);
    }


}
