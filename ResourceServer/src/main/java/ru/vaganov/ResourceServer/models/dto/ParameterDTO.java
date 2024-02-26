package ru.vaganov.ResourceServer.models.dto;

import lombok.*;
import ru.vaganov.ResourceServer.models.Parameter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ParameterDTO {

    private Long id;
    private String name;
    private String additionalName;
    private String unit;
    private Double refMin;
    private Double refMax;
    private Parameter.ResearchType researchType;


    @Override
    public String toString(){
        return String.format("%s (%s) [%.2f : %.2f]",name,additionalName,refMax,refMax);
    }
}
