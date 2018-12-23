package com.yaorange.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public interface EsService {
	 void saveDataToEs(String id, String json);
	 void saveDataToEsBulk(List<Map<String, Object>> list) throws IOException;
	 long deleteFromEsBulk(List<Long> list);

}
