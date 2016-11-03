package tetris;

import javafx.scene.paint.Color;

public class LeftSquiggle extends Block
{  
    public LeftSquiggle()
    {
        super(new char[][][] 
        {
            {
                
                {'*', '*', '_', '_'}, 
                {'_', '*', '*', '_'},
                {'_', '_', '_', '_'},
                {'_', '_', '_', '_'}
            },
            {
                {'_', '_', '*', '_'}, 
                {'_', '*', '*', '_'},
                {'_', '*', '_', '_'},
                {'_', '_', '_', '_'}
            },
            {
                {'_', '_', '_', '_'}, 
                {'*', '*', '_', '_'},
                {'_', '*', '*', '_'},
                {'_', '_', '_', '_'},
            },
            {
                {'_', '*', '_', '_'}, 
                {'*', '*', '_', '_'},
                {'*', '_', '_', '_'},
                {'_', '_', '_', '_'},
            }
        }
                , Color.RED);
    }
}
