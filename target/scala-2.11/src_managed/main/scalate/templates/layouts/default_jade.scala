/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates.layouts

object $_scalate_$default_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      implicit val context: _root_.org.scalatra.scalate.ScalatraRenderContext = $_scalate_$_context.attribute("context")
      import context._
      ;{
        val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
        import context._
        
        
        ;{
          val title: String = $_scalate_$_context.attribute("title")
          ;{
            val headline: String = $_scalate_$_context.attributeOrElse("headline", title)
            ;{
              val body: String = $_scalate_$_context.attribute("body")
              $_scalate_$_context << ( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n<html>\n  <head>\n    <title>" );
              $_scalate_$_context << ( $_scalate_$_indent ( "    ", $_scalate_$_context.value(
                 title
              ) ) );
              $_scalate_$_context << ( "</title>\n  </head>\n  <body>\n    <div id=\"content\">\n      <h1>" );
              $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value(
                 headline
              ) ) );
              $_scalate_$_context << ( "</h1>\n      " );
              $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.valueUnescaped(
                 body
              ) ) );
              $_scalate_$_context << ( "\n    </div>\n  </body>\n</html>\n" );
            }
          }
        }
      }
    }
  }
}


class $_scalate_$default_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$default_jade.$_scalate_$render(context)
}
