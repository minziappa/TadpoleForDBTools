/*******************************************************************************
 * Copyright (c) 2013 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.sql.template;

import com.hangum.tadpold.commons.libs.core.define.PublicTadpoleDefine;

/**
 * MySQL 디비의 쿼리를 정의 합니다.
 * 
 * @author hangum
 *
 */
public class MySQLDMLTemplate extends AbstractDMLTemplate {
	/**  
	 * mysql 을 수행할때 preference에서 정의한 쿼리가 초과 되었을때 sub query를 수행합니다.
	 */	
	public static final String TMP_GET_PARTDATA = " %s limit %s,%s";
	
	public static final String TMP_EXPLAIN_EXTENDED = "explain extended  ";
	
	/** table - mysql */
	public static final String  TMP_CREATE_TABLE_STMT = "CREATE TABLE   sample_table   (  " + PublicTadpoleDefine.LINE_SEPARATOR + 
						 " id INT(11) default NULL auto_increment,   " + PublicTadpoleDefine.LINE_SEPARATOR +
						 " name char(60) default NULL,  " + PublicTadpoleDefine.LINE_SEPARATOR +
						 " PRIMARY KEY (id)  " + PublicTadpoleDefine.LINE_SEPARATOR +
						" );";
	
	/** view -mysql */
	public static final String  TMP_CREATE_VIEW_STMT = "CREATE VIEW   view_name   AS  " + PublicTadpoleDefine.LINE_SEPARATOR + 
																" SELECT   columns   FROM   table;";

	/** alter view template */
	public static final String TMP_ALTER_VIEW_STMT = "ALTER ALGORITHM=UNDEFINED DEFINER='%s'@'%' " + PublicTadpoleDefine.LINE_SEPARATOR +
													" SQL SECURITY DEFINER VIEW '%s' AS " + PublicTadpoleDefine.LINE_SEPARATOR +
													"";
	
	/** index */
	public static final String  TMP_CREATE_INDEX_STMT = "CREATE INDEX  index_name "+ PublicTadpoleDefine.LINE_SEPARATOR +  
														" ON table_name ( columns );";
	
	
	
	/** procedure */
	public static final String  TMP_CREATE_PROCEDURE_STMT = "CREATE PROCEDURE simpleproc (OUT param1 INT) " + PublicTadpoleDefine.LINE_SEPARATOR +
																	  " BEGIN  " + PublicTadpoleDefine.LINE_SEPARATOR +
																	  "  SELECT COUNT(*) INTO param1 FROM t;  " + PublicTadpoleDefine.LINE_SEPARATOR +
																	  " END;";
	
	
	/** function */
	public static final String TMP_CREATE_FUNCTION_STMT = "CREATE FUNCTION hello (s CHAR(20)) RETURNS CHAR(50)  " + PublicTadpoleDefine.LINE_SEPARATOR + 
																	" RETURN CONCAT('Hello, 's');";
	
	
	
	/** trigger */
	public static final String TMP_CREATE_TRIGGER_STMT = "CREATE TRIGGER testref BEFORE INSERT ON test1  " + PublicTadpoleDefine.LINE_SEPARATOR +
																"	  FOR EACH ROW BEGIN   " + PublicTadpoleDefine.LINE_SEPARATOR +
																"	    INSERT INTO test2 SET a2 = NEW.a1;   " + PublicTadpoleDefine.LINE_SEPARATOR +
																"	    DELETE FROM test3 WHERE a3 = NEW.a1;   " + PublicTadpoleDefine.LINE_SEPARATOR +
																"	    UPDATE test4 SET b4 = b4 + 1 WHERE a4 = NEW.a1;   " + PublicTadpoleDefine.LINE_SEPARATOR +
																"	  END;";
}
