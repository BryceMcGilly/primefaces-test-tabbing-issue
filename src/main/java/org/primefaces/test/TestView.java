package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

	private static final long serialVersionUID = 1L;

	private String string;
	private List<TestObject> list;

	@PostConstruct
	public void init() {
		string = "Reproducer for primefaces discussion 3196";
		list = new ArrayList<>(Arrays.asList(new TestObject("Thriller", "Michael Jackson", 1982),
				new TestObject("Back in Black", "AC/DC", 1980),
				new TestObject("The Bodyguard", "Whitney Houston", 1992),
				new TestObject("The Dark Side of the Moon", "Pink Floyd", 1973)));
	}

	public String getHeading() {
		return string;
	}

	public List<TestObject> getList() {
		return list;
	}
}
