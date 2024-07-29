package ru.vaganov.ResourceServer.controllers.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vaganov.ResourceServer.dto.ReportData;
import ru.vaganov.ResourceServer.services.ReportService;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reports")
@Tag(name = "Report API")
@Slf4j
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @Operation(summary = "Формирование отчета по анализу", description = "Формирование отчета по анализу" )
    @GetMapping("/{patientId}/test/{testId}")
    public ResponseEntity<ReportData> findOncologicalTestByTestId(
            @PathVariable UUID patientId,
            @PathVariable Long testId){
        return new ResponseEntity<>(reportService.createReportByTestId(patientId,testId), HttpStatus.OK);
    }

}
