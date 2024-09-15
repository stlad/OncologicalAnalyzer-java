package ru.vaganov.lehaim.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Schema(description = "Диагноз")
public class DiagnosisDTO {
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Код диагноза из каталога", example = "C16")
    private String code;

    @Schema(description = "Описание диагноза из каталога", example = "ЗНО желудка")
    private String description;
}

