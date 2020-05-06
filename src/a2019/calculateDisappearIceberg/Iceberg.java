package a2019.calculateDisappearIceberg;

public class Iceberg {

	/**
	 * 현재 빙산 지도에서 내부 물을 구분하는 기능
	 * 
	 * @param icebergMap
	 *            빙산 지도 데이터
	 * @return int[][] "내부 물"을 9로 변경한 빙산 지도 데이터
	 */
	public int[][] convertInnerWater(int[][] icebergMap) {

		int[][] innerMap = null;

		////////////////////// 여기부터 구현 (1) ---------------->

		innerMap = new int[icebergMap.length][icebergMap[0].length];
		int rowCnt = icebergMap.length;
		int colCnt = icebergMap[0].length;

		// 처기화
		for (int r = 0; r < icebergMap.length; r++) {
			for (int c = 0; c < icebergMap[r].length; c++) {
				innerMap[r][c] = icebergMap[r][c];
				if (r == 0 || c == 0 || r == icebergMap.length - 1 || c == icebergMap[r].length - 1) {
					if (icebergMap[r][c] == 0) {
						innerMap[r][c] = -1;
					}
				}
			}
		}

		for (int i = 0; i < Math.max(rowCnt, colCnt) - 1; i++) {
			checkOutWater(innerMap);
		}

		checkInnerWater(innerMap);
		rollbackOutWater(innerMap);

		///////////////////////////// <-------------- 여기까지 구현 (1)

		return innerMap;
	}

	private void checkOutWater(int[][] map) {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				if (map[r][c] == -1) {
					continue;
				} else if (map[r][c] == 0) {
					int[] around = getAround(map, r, c);
					for (int a : around) {
						if (a == -1) {
							map[r][c] = -1;
							break;
						}
					}
				}
			}
		}
	}

	private int[] getAround(int[][] map, int row, int col) {
		int up = -9;
		int right = -9;
		int down = -9;
		int left = -9;

		if (row != 0) {
			up = map[row - 1][col];
		}
		if (col != 0) {
			left = map[row][col - 1];
		}
		if (row != map.length - 1) {
			down = map[row + 1][col];
		}
		if (col != map[0].length - 1) {
			right = map[row][col + 1];
		}

		return new int[] { up, right, down, left };
	}

	private void checkInnerWater(int[][] innerMap) {
		for (int r = 0; r < innerMap.length; r++) {
			for (int c = 0; c < innerMap[r].length; c++) {
				if (innerMap[r][c] == 0) {
					innerMap[r][c] = 9;
				}
			}
		}
	}

	private void rollbackOutWater(int[][] innerMap) {
		for (int r = 0; r < innerMap.length; r++) {
			for (int c = 0; c < innerMap[r].length; c++) {
				if (innerMap[r][c] == -1) {
					innerMap[r][c] = 0;
				}
			}
		}

	}

	/**
	 * 몇 년 후 빙산이 모두 사라지는지 구하는 기능
	 * 
	 * @param icebergMap
	 *            빙산 지도 데이터
	 * @return int 빙산이 모두 사라지는 년 수
	 */
	public int getCollapseYear(int[][] icebergMap) {

		int collYear = 0;

		////////////////////// 여기부터 구현 (2) ---------------->

		int[][] map = convertInnerWater(icebergMap);

		while (hasIce(map)) {
			collYear++;
			map = warm(map);
			map = convertInnerWater(map);
			printMap(map, collYear);
		}

		///////////////////////////// <-------------- 여기까지 구현 (2)

		return collYear;
	}

	/**
	 * 빙하를 녹인다.
	 * 
	 * @param map
	 */
	private int[][] warm(int[][] map) {
		
		int[][] innerMap = new int[map.length][map[0].length];

		// 처기화
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				innerMap[r][c] = map[r][c];
			}
		}
		
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				int val = map[r][c];

				if (val >= 1 && val <= 4) {
					int[] around = getAround(map, r, c);
					int outWaterCount = 0;
					for (int a : around) {
						if (a == 0) {
							outWaterCount++;
						}
					}
					if (outWaterCount == 1) {
						innerMap[r][c] = Math.max(0, val - 1);
					} else if (outWaterCount == 2) {
						innerMap[r][c] = Math.max(0, val - 2);
					} else if (outWaterCount == 3) {
						innerMap[r][c] = Math.max(0, val - 3);
					} else if (outWaterCount == 4) {
						innerMap[r][c] = Math.max(0, val - 4);
					}
				}

			}
		}
		for (int r = 0; r < innerMap.length; r++) {
			for (int c = 0; c < innerMap[r].length; c++) {
				if (innerMap[r][c]==9) {
					innerMap[r][c] = 0;
				}
			}
		}
		
		return innerMap;

	}

	private boolean hasIce(int[][] map) {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				if (map[r][c] != 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean DEBUG = false;

	private void printMap(int[][] map, int year) {
		
		debug("============================" + year);
		for (int r = 0; r < map.length; r++) {
			String line = "";
			for (int c = 0; c < map[r].length; c++) {
				line += (map[r][c] + " ");
			}
			debug(line);
		}
		debug("============================" + year);
	}

	private static void debug(Object obj) {
		if (DEBUG) {
			System.out.println(obj);
		}
	}

}