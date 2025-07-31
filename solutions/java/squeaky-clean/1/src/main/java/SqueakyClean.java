class SqueakyClean {
    static String clean(String identifier) {
        if (identifier == null || identifier.equals("")) {
            return identifier;
        }
        identifier = spacesToUnderscores(identifier);
        identifier = kebabCaseToCamelCase(identifier);
        identifier = leetspeakToNormalText(identifier);
        identifier = onlyLetters(identifier);
        return identifier;
    }
    
    private static String spacesToUnderscores(String identifier) {
        return identifier != null ? identifier.replace(' ', '_') : null;
    }

    private static String kebabCaseToCamelCase(String identifier) {
        if (identifier == null || !identifier.contains("-")) {
            return identifier;
        }
        StringBuilder newIdentifier = new StringBuilder();
        char[] myChars = identifier.toCharArray();
        for (int i=0; i<myChars.length; i++) {
            if (myChars[i] == '-' && i+1<myChars.length) {
                newIdentifier.append(Character.toUpperCase(myChars[++i]));
                continue;
            }
            newIdentifier.append(myChars[i]);
        }     
        return newIdentifier.toString();
    }

    private static String leetspeakToNormalText(String identifier) {
        if (identifier == null) {
            return identifier;
        }
        if (identifier.contains("0")) {
            identifier = identifier.replace('0', 'o');
        }
        if (identifier.contains("1")) {
            identifier = identifier.replace('1', 'l');
        }
        if (identifier.contains("3")) {
            identifier = identifier.replace('3', 'e');
        }
        if (identifier.contains("4")) {
            identifier = identifier.replace('4', 'a');
        }
        if (identifier.contains("7")) {
            identifier = identifier.replace('7', 't');
        }
        return identifier;
    }

    private static String onlyLetters(String identifier) {
        if (identifier == null) {
            return identifier;
        }
        StringBuilder newIdentifier = new StringBuilder();
        char[] myChars = identifier.toCharArray();
        for (int i=0; i<myChars.length; i++) {
            if (Character.isLetter(myChars[i]) || myChars[i] == '_') {
                newIdentifier.append(myChars[i]);
            }
        }
        return newIdentifier.toString();
    }
}
