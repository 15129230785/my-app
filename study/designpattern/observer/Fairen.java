public interface Huairen {
     //添加便衣观察者
             void addObserver(Observer observer);
     //移除便衣观察者
             void removeObserver(Observer observer);
     //通知观察者
             void notice(String message);
 }

 import java.util.*;
          /**
    * 嫌犯大熊
    */
          public class XianFan1 implements Huairen {
      //别称
              private String name = "大熊";
      //定义观察者集合
              private List<Observer> observerList = new ArrayList<Observer>();
     //增加观察者
             @Override
     public void addObserver(Observer observer) {
                 if(!observerList.contains(observer)){
                         observerList.add(observer);
                     }
             }
     //移除观察者
             @Override
     public void removeObserver(Observer observer) {
                 if(observerList.contains(observer)){
                         observerList.remove(observer);
                     }
             }
     //通知观察者
             @Override
     public void notice(String message) {
                 for(Observer observer:observerList){
                         observer.update(message,name);
                     }
             }
 }