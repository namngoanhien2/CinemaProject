package com.dts.cinema.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ArrayListResponse<T> extends BaseResponse {

    List<T> rows;

	public ArrayListResponse(List<T> rows) {
		super();
		this.rows = rows;
	}
    
}
