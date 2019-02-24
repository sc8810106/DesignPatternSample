package StructuralPattern.FilterPattern;

import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
