@Service
public class HelloServiceImpl implements HelloService{
    public String hello(String parm) {
        return "HELLO : " + parm;
    }
}
