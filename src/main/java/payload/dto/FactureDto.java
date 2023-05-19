package payload.dto;

import com.app.models.Convention;
import com.app.models.Facture;
import com.app.models.Structure;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class FactureDto {

    private Long id;

    private String convention;
    private String structure;
    private LocalDate dueDatefct;
    private BigDecimal amount;
    private String period;
    private String status;

    public static List<FactureDto> entityToDto(List<Facture> factures){
        return factures.stream().map(i->toDto(i)).collect(Collectors.toList());
    }

    public static FactureDto toDto(Facture facture){
        if (facture == null) {
            return null;
        }

        return FactureDto.builder()
                .id(facture.getId())
                .convention(Long.toString(facture.getConvention().getId()))
                .structure(facture.getStructure().getCode())
                .amount(facture.getAmount())
                .dueDatefct(facture.getDueDatefct())
                .status(facture.getStatus())
                .period(facture.getPeriod())
                .build();
    }


}
