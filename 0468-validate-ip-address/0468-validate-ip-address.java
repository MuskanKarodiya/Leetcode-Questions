class Solution {
    public String validIPAddress(String ip) {
        if(ip==null || ip.length()==0) return "Neither";
        if(ip.contains(".")) return checkIPV4(ip);
        if(ip.contains(":")) return checkIPV6(ip);
        return "Neither";
    }
    public String checkIPV4(String ip){
        String N="Neither";
        if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.') return N;

        String [] parts=ip.split("\\.");
        if(parts.length!=4) return N;
        for(String part: parts){
            if(part.length()==0 || part.length()>3 || (part.charAt(0)=='0' && part.length()>1)) return N;

            for(int i=0;i<part.length();i++){
                if(part.charAt(i)<'0' || part.charAt(i)>'9') return N;
            }
            if(Integer.valueOf(part)>255) return N;
        }
        return "IPv4";
    }
    public String checkIPV6(String ip){
        String N="Neither";
        if(ip.charAt(ip.length()-1)==':') return N;

        String [] parts=ip.split(":");
        if(parts.length!=8) return N;
        for(String part: parts){
            if(part.length()==0 || part.length()>4) return N;
            for(int i=0;i<part.length();i++){
                char c=part.charAt(i);
                if(!(c>='0' && c<='9' ) && !(c>='a' && c<='f') && !(c>='A' && c<='F')) return N;
            }
        }
        return "IPv6";
    }
}