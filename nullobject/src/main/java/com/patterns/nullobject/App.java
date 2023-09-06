package com.patterns.nullobject;

import com.patterns.nullobject.interfaces.Log;
import com.patterns.nullobject.models.BankAccount;
import com.patterns.nullobject.models.ConsoleLog;
import com.patterns.nullobject.models.NullLog;

/**
 * Hello world!
 *
 */
public class App 
{

    @SuppressWarnings("unchecked")
    private static <T> T noOp(Class<T> itf) {
        return (T) java.lang.reflect.Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] { itf },
                (proxy, method, args) -> { // new InvocationHandler()
                    if (method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                }
        );
    }

    public static void main( String[] args ) {

        // Normal usage
        ConsoleLog log = new ConsoleLog();
        BankAccount ba = new BankAccount(log);

        ba.deposit(100);

        // Null object
        NullLog nullLog = new NullLog();
        BankAccount ba2 = new BankAccount(nullLog);

        ba2.deposit(100);

        // Dynamic Proxy
        Log log2 = noOp(Log.class);
        BankAccount ba3 = new BankAccount(log2);

        ba3.deposit(100);

    }
}
