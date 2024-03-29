package com.katziio.codewithkatz.dto.editordto;

import com.katziio.codewithkatz.entity.editorentity.EditorSkill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditorSkillDTO {
    private Long id;
    private String aboutSkill;
    private String availability;
    private String flexibility;
    private String technicalProficiency;
    private String equipmentDetails;

    public EditorSkillDTO(EditorSkill editorSkill)
    {
        this.id=editorSkill.getId();
        this.aboutSkill=editorSkill.getAboutSkill();
        this.availability=editorSkill.getAvailability();
        this.equipmentDetails=editorSkill.getEquipmentDetails();
        this.flexibility=editorSkill.getFlexibility();
        this.technicalProficiency=editorSkill.getTechnicalProficiency();
    }
}
