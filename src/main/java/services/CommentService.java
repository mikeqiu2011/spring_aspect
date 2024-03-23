package services;

import main.Comment;
import main.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.text());
        return "SUCCESS";
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.text());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.text());
    }
}
