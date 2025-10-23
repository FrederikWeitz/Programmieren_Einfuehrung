package org.example;

import static org.example.decisions.DecisionsDemonstrate.writeExaminationGrade;
import static org.example.decisions.DecisionsUtil.isInInterval;

public class App {
  public static void main(String[] args) {
    // Parameter (2, [0, 10])
    // Parameter (2, [0]) + (2, [0, 10, 15])
    // Parameter (2, [10, 0])

    boolean isContained = isInInterval(9.99999, new double[]{10, 0});

    System.out.println((isContained) ? "enthalten" : "nicht enthalten");
  }
}