package StructuralPattern.FilterPattern;

import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class AndCriteria implements Criteria {

    private Criteria firstcriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstcriteria, Criteria secondCriteria) {
        this.firstcriteria = firstcriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstcriteria.meetCriteria(persons);
        return secondCriteria.meetCriteria(firstCriteriaPersons);
    }
}
