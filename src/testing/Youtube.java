package testing;

public class Youtube {
    private String _channel;
    private int _abos;
    public Youtube(String Channel,int abos){
     this._channel = Channel;
     this._abos = abos;
    }
    public String Channel(){return this._channel; }
    public int abos(){return this._abos;}
}
