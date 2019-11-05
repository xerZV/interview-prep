package com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
