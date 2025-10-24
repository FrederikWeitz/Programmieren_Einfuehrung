package org.example.authority;

import static org.example.authority.DB.queryDBForAuthorization;

public class Authorization {

  public static boolean checkAuthority(int id, int roomNr) {
    int[][] arr = queryDBForAuthorization();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr[i].length; j++) {
        if (arr[i][0] == id && arr[i][j] == roomNr) {
          return true;
        }
      }
    }
    return false;
  }
}
