package codecheck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		//引数2個未満はエラー
		if (args.length <= 2) {
			System.out.println("Error01!");
			return;
		}

		StringBuilder sb = new StringBuilder();

		//値の格納用
		Map<Integer, String> keyMap = new HashMap<>();

		for (int i = 0; i < args.length - 1; i++) {

			String[] params = args[i].split(":");
			keyMap.put(Integer.parseInt(params[0]), params[1]);

		}

		int targetParam = Integer.parseInt(args[args.length - 1]);

		// キーでソート
		Object[] mapkey = keyMap.keySet().toArray();
		Arrays.sort(mapkey);

		for (Integer nKey : keyMap.keySet()) {

			if (targetParam % nKey == 0) {
				sb.append(keyMap.get(nKey));
			}

		}

		if (sb.length() == 0) {
			System.out.println(args[args.length - 1]);
		} else {
			System.out.println(sb.toString());
		}

	}
}
