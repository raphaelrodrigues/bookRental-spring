package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-28T17:06:36")
@StaticMetamodel(Rent.class)
public class Rent_ { 

    public static volatile SingularAttribute<Rent, Date> createdAt;
    public static volatile SingularAttribute<Rent, String> name;
    public static volatile SingularAttribute<Rent, Integer> id;
    public static volatile SingularAttribute<Rent, Integer> bookId;

}