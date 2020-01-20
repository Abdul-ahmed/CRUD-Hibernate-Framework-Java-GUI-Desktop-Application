package org.stock.user;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UsersDeclarationClass.class)
public abstract class UsersDeclarationClass_ {

	public static volatile SingularAttribute<UsersDeclarationClass, String> password;
	public static volatile SingularAttribute<UsersDeclarationClass, Date> times;
	public static volatile SingularAttribute<UsersDeclarationClass, Date> dates;
	public static volatile SingularAttribute<UsersDeclarationClass, Long> id;
	public static volatile SingularAttribute<UsersDeclarationClass, String> levels;
	public static volatile SingularAttribute<UsersDeclarationClass, String> username;
	public static volatile SingularAttribute<UsersDeclarationClass, Boolean> status;

}

