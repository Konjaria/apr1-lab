package ge.tsu.enums;

public enum Status {
    GOOD {
        @Override
        public String getReadable(){
          return "Good";
        };
    },
    BAD {
        @Override
        public String getReadable(){
            return "Bad";
        };
    },
    UNKNOWN{
        @Override
        public String getReadable(){
            return "Unknown";
        };
    };

    public abstract String getReadable();
}
