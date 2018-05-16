@TypeDefs({
	@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class),
	@TypeDef(name = "jsonb-node", typeClass = JsonNodeBinaryType.class)
})
package com.cognive.storage.app.rdbms.entity;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
