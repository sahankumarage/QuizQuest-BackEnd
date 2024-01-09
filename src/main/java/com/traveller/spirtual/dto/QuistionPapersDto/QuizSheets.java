package com.traveller.spirtual.dto.QuistionPapersDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizSheets {
    private int id;
    private String sheetsSubject;
    private String sheetLevel;
    private String postedBy;
    private int questions;

}
