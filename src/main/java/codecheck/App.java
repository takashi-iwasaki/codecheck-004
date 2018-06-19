package codecheck;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		//引数3個以外はエラー
		if (args.length != 3) {
			System.out.println("Error01!");
			return;
		}

		StringBuilder sb = new StringBuilder();

		//値の格納用
		Map<String, String> keyMap = new HashMap<>();

		String[] params1 = args[0].split(":");
		String[] params2 = args[1].split(":");

		if (Integer.parseInt(params1[0]) <= Integer.parseInt(params2[0])) {

			if (Integer.parseInt(args[2]) % Integer.parseInt(params1[0]) == 0) {
				sb.append(params1[1]);
			}
			if (Integer.parseInt(args[2]) % Integer.parseInt(params2[0]) == 0) {
				sb.append(params2[1]);
			}
		} else {
			if (Integer.parseInt(args[2]) % Integer.parseInt(params2[0]) == 0) {
				sb.append(params2[1]);
			}
			if (Integer.parseInt(args[2]) % Integer.parseInt(params1[0]) == 0) {
				sb.append(params1[1]);
			}
		}

		if (sb.length() == 0) {
			System.out.println(args[2]);
		} else {
			System.out.println(sb.toString());
		}

	}
}
