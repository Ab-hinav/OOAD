public enum Builder {

    FENDER,MARTIN,GIBSON,RYAN,COLLINS,OLSON,PRS,ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER: return "fender";
            case MARTIN: return "martin";
            case GIBSON: return "gibson";
            case RYAN: return "ryan";
            case COLLINS: return "collins";
            case OLSON: return "olson";
            case PRS: return "prs";
            case ANY: return "any";
        }

        return "";
    }


}
