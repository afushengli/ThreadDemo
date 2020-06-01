package com.fsl.mianshi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer Id;
    private String personName;

    public Person( String personName){
        this.personName = personName;
    }

}
