package StructuralPattern.FilterPattern;

import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class OrCriteria implements Criteria {

    private Criteria firstcriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria firstcriteria, Criteria secondCriteria) {
        this.firstcriteria = firstcriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstcriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons = secondCriteria.meetCriteria(persons);

        for (Person person : secondCriteriaPersons) {
            if(!firstCriteriaPersons.contains(person)){
                firstCriteriaPersons.add(person);
            }
        }
        return firstCriteriaPersons;
    }
}
