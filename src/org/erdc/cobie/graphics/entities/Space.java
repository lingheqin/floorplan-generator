package org.erdc.cobie.graphics.entities;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.models.ifc2x3tc1.IfcSpace;
import org.erdc.cobie.graphics.Engine;
import org.erdc.cobie.graphics.InvalidMeshException;
import org.erdc.cobie.graphics3d.Utils;

import com.sun.j3d.utils.geometry.GeometryInfo;

public final class Space extends RenderableSpatialStructureBranch
{
    public Space(IfcModelInterface model, Engine engine, IfcSpace space)
    {
        super(model, engine, space);
    }
	
    @Override
    protected GeometryInfo makeMesh() throws InvalidMeshException
    {
    	getParser().parse();
    	GeometryInfo mesh = org.erdc.cobie.graphics3d.Utils.makeMesh(getParser().getVertices(), getParser().getNormals());   	
        Utils.transformMesh(getParser().getTransform(), mesh);
        return mesh; 
    }
}
