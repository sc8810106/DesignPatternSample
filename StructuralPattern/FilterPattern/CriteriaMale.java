package StructuralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class CriteriaMale implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
