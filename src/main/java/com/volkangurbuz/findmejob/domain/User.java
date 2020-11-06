package com.volkangurbuz.findmejob.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String id;
  private String userName;
  private String userPassword;
  private List<Skill> skillList;
}
