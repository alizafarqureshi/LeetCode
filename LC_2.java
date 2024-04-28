String s = "abcabcbb";
        int maxLenth = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i + 1; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }

                currentSubstring.append(s.charAt(j));
                maxLenth = Math.max(maxLenth,currentSubstring.length());

            }

        }
