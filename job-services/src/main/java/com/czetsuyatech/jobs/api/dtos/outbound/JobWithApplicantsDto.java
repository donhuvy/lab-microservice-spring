package com.czetsuyatech.jobs.api.dtos.outbound;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobWithApplicantsDto {

  private String job;
  private List<String> applicants;

}
