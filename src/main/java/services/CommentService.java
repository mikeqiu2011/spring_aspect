package services;

import main.Comment;
import main.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.text());
        return "SUCCESS";
    }
}
