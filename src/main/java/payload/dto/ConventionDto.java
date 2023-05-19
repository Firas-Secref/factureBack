package payload.dto;

import com.app.models.Convention;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class ConventionDto {

    private Long id;
    private String appCode;
    private String structCode;
    private BigDecimal nbr_reel;
    private BigDecimal nbr_Min;
    private BigDecimal nbr_Max;
    private LocalDate dateSignature;
    private int conventionDuration;
    private BigDecimal price;
    private BigDecimal totalAmount;
    private LocalDate dueDate;

    public static ConventionDto toDto(Convention convention){
        if (convention == null) {
            return null;
        }

        return ConventionDto.builder()
                .id(convention.getId())
                .appCode(convention.getApplication().getCode())
                .structCode(convention.getStructure().getCode())
                .nbr_reel(convention.getNbr_reel())
                .nbr_Max(convention.getNbr_Max())
                .nbr_Min(convention.getNbr_Min())
                .conventionDuration(convention.getConventionDuration())
                .dueDate(convention.getDueDate())
                .totalAmount(convention.getTotalAmount())
                .price(convention.getPrice())
                .dateSignature(convention.getDateSignature())
                .build();
    }

    public static List<ConventionDto> entityToDto(List<Convention> conventions){
        return conventions.stream().map(i->toDto(i)).collect(Collectors.toList());
    }
}
