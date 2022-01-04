package controller;


import com.sun.tools.javac.util.Pair;
import model.Task;
import model.User;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.List;

public class CalenderController {
    public void showCalender(User user) {
        List<Task> tasks = Task.userTasksMap.get(user);
        if (tasks == null || tasks.isEmpty()){
            System.out.println("no deadlines");
            return;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tasks.stream().map(t -> new Pair<>(t, t.getDeadlineRemainingDay()))
                .filter(p -> p.getValue() >= 0)
                .sorted(Comparator.comparing(Pair::getValue))
                .forEach(taskDayPair -> System.out.println(getTaskStar(taskDayPair.getValue()) + simpleDateFormat.format(taskDayPair.getKey().getDeadline()) + "__remaining days:" + taskDayPair.getValue()));
    }

    private String getTaskStar(Long day) {
        if (day < 4)
            return "***";
        else if(day <= 10)
            return "**";
        else
            return "*";
    }
}
