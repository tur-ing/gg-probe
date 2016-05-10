package de.gg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class TableController {
	
	private String tableSize = "In der Tabelle befinden sich %s Einträge.";
	
    @Autowired
    JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value = "/tableSize", method = RequestMethod.GET)
	public String returnTableSize() {
		return String.format(tableSize, calculateTableSize());
	}
	
	private String calculateTableSize() {
		String sql = "SELECT COUNT(*) FROM VBKAD";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return Integer.toString(count);
	}

}
