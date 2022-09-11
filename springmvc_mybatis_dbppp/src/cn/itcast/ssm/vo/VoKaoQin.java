package cn.itcast.ssm.vo;

import java.util.List;

import cn.itcast.ssm.po.original.Kaoqin;

public class VoKaoQin extends Kaoqin {

    private List<Kaoqin> kaoqinlist;

    private String yue;
    
	public String getYue() {
		return yue;
	}

	public void setYue(String yue) {
		this.yue = yue;
	}

	public List<Kaoqin> getKaoqinlist() {
		return kaoqinlist;
	}

	public void setKaoqinlist(List<Kaoqin> kaoqinlist) {
		this.kaoqinlist = kaoqinlist;
	}

    



}