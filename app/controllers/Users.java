package controllers;

import play.*;
import play.mvc.*;

/**
 * Created by zyw on 2016/6/17.
 */

@Check("admin")
@With(Secure.class)
public class Users extends CRUD {
}
