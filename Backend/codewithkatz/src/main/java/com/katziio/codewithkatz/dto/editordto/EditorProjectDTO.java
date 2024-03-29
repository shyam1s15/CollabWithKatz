package com.katziio.codewithkatz.dto.editordto;

import com.katziio.codewithkatz.entity.editorentity.EditorProject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditorProjectDTO {
    private Long id;
    private String projectName;
    private boolean projectStatus;

    public EditorProjectDTO(EditorProject editorProject)
    {
        this.id=editorProject.getId();
        this.projectName=editorProject.getProjectName();
        this.projectStatus=editorProject.isProjectStatus();
    }
}
