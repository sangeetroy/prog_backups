#// last done till 43 pg no do the graph inequalities the next day.

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys
#from numpy import *
import numpy as np
import math

def init():
    glClearColor(1.0,1.0,1.0,1.0)
    gluOrtho2D(-5.0,5.0,-5.0,5.0)

def plotfunc():
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(0.0,0.0,0.0)          # color
    glPointSize(1.0)
    a = 5.5 
    b = 5.5
    c = 0.5
    d = 0.5
    for t in np.arange(0.0,6.28,0.01):
        x = (c*t+d)*math.sin(t)
        y = math.sin(a*t+b)
        glBegin(GL_POINTS)
        glVertex2f(x,y)
        glEnd()
    # adding coordinates
    glBegin(GL_LINES)
    glVertex2f(-5.0,0.0)
    glVertex2f(5.0,0.0)
    glVertex2f(0.0,5.0)
    glVertex2f(0.0,-5.0)
    #glVertex2f(-5.0,-5.0)
    #glVertex2f(3.0,5.0)
    glEnd()
    glFlush()

def main():
    glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
    glutCreateWindow("Plot Points")
    glutInitWindowSize(400,400)
    glutInitWindowPosition(50,50)
    glutDisplayFunc(plotfunc)
    init()
    glutMainLoop()

main()
